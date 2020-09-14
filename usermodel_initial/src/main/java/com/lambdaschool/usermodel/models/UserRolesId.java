package com.lambdaschool.usermodel.models;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UserRolesId implements Serializable
{
    private long user;

    private long role;

    public UserRolesId()
    {
    }

    public UserRolesId(long user, long role)
    {
        this.user = user;
        this.role = role;
    }

    public long getUser()
    {
        return user;
    }

    public void setUser(long user)
    {
        this.user = user;
    }

    public long getRole()
    {
        return role;
    }

    public void setRole(long role)
    {
        this.role = role;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserRolesId that = (UserRolesId) o;
        return this.user == that.user &&
               this.role == that.role;
    }

    @Override
    public int hashCode()
    {
        return 37;
    }
}
