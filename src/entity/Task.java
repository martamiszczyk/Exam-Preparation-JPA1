/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author martamiszczyk
 */
@Entity
public class Task
{
    private String name;
    private String description;
    private long hoursAssignet;
    private long hoursUsed;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Task()
    {
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public long getHoursAssignet()
    {
        return hoursAssignet;
    }

    public void setHoursAssignet(long hoursAssignet)
    {
        this.hoursAssignet = hoursAssignet;
    }

    public long getHoursUsed()
    {
        return hoursUsed;
    }

    public void setHoursUsed(long hoursUsed)
    {
        this.hoursUsed = hoursUsed;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }
}
