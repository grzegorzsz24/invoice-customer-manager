package com.example.invoicecustomermanager.repository.implementation;

import com.example.invoicecustomermanager.exception.ApiException;
import com.example.invoicecustomermanager.model.Role;
import com.example.invoicecustomermanager.repository.RoleRepository;
import com.example.invoicecustomermanager.rowmapper.RoleRowMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Map;

import static com.example.invoicecustomermanager.enumeration.RoleType.ROLE_USER;

@Repository
@RequiredArgsConstructor
@Slf4j
public class RoleRepositoryImpl implements RoleRepository<Role> {
    private static final String SELECT_ROLE_BY_NAME_QUERY = "";
    private static final String INSERT_ROLE_TO_USER = "";
    private final NamedParameterJdbcTemplate jdbc;

    @Override
    public Role create(Role data) {

        return null;
    }

    @Override
    public Collection<Role> list(int page, int pageSize) {
        return null;
    }

    @Override
    public Role get(Long id) {
        return null;
    }

    @Override
    public Role update(Role data) {
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }

    @Override
    public void addRoleToUser(Long userId, String roleName) {
        log.info("Adding role {} to user id: {}", roleName, userId);
        try {
            Role role = jdbc.queryForObject(SELECT_ROLE_BY_NAME_QUERY, Map.of("roleName", roleName), new RoleRowMapper());
            jdbc.update(INSERT_ROLE_TO_USER, Map.of("userId", userId, "roleId", role.getId()));

        } catch (EmptyResultDataAccessException exception) {
            throw new ApiException("No role found by name: " + ROLE_USER.name());

        } catch (Exception exception) {
            throw new ApiException("An error occurred, please try again!");
        }
    }

    @Override
    public Role getRoleByUserId(Long userid) {
        return null;
    }

    @Override
    public Role getRoleByUserEmail(String email) {
        return null;
    }

    @Override
    public void updateUserRole(Long userId, String roleName) {

    }
}