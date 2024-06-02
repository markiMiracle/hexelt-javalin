package org.example.hexlet.repository;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import lombok.Getter;
import org.example.hexlet.model.User;

public class UserRepository  extends BaseRepository {

    public static void save(User user) throws SQLException {
        String sql = "INSERT INTO users (firstName, lastName, email, password) VALUES (?, ?, ?, ?)";
        try (var conn = dataSource.getConnection();
                    var preparedStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setString(1, user.getFirstName());
            preparedStatement.setString(2, user.getLastName());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.setString(4, user.getPassword());
            preparedStatement.executeUpdate();

            var generatedKeys = preparedStatement.getGeneratedKeys();

            if (generatedKeys.next()) {
                user.setId(generatedKeys.getLong(1));
            } else {
                throw new SQLException("DB have not returned an id after saving an entity");
            }
        }
    }

    public static List<User> search(String term) throws SQLException {
        var entities = getEntities();
        return entities.stream()
                .filter(entity -> entity.getFirstName().startsWith(term))
                .toList();
    }

    public static Optional<User> find(Long id) throws SQLException {
        var entities = getEntities();
        return entities.stream()
                .filter(entity -> entity.getId().equals(id))
                .findAny();
    }


    public static List<User> getEntities() throws SQLException {
        var sql = "SELECT * FROM users";

        try (var conn = dataSource.getConnection();
             var stmt = conn.prepareStatement(sql)) {
            var resultSet = stmt.executeQuery();
            var result = new ArrayList<User>();

            while (resultSet.next()) {
                var id = resultSet.getLong("id");
                var firstName = resultSet.getString("firstName");
                var lastName = resultSet.getString("lastName");
                var email = resultSet.getString("email");
                var password = resultSet.getString("password");
                var user = new User(firstName, lastName, email, password);
                user.setId(id);
                result.add(user);
            }
            return result;
        }
    }

}