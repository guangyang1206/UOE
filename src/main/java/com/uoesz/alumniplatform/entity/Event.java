package com.uoesz.alumniplatform.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @version V1.0
 * @Title:
 * @Package
 * @Description: TODO
 * @date
 */

/**
 * The persistent class for the session database table.
 */

@Entity
@NamedQuery(name = "Event.findAll", query = "SELECT e FROM Event e")
public class Event implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "date")
    private Date date;

    @Column(name = "location")
    private String location;

    @Column(name = "organizer")
    private String organizer;

    @Column(name = "type")
    private String type;

    @Column(name = "participant_limit")
    private String participantLimit;

    public Event() {
    }

    public Event(String name, String description, Date date, String location, String organizer, String type, String participantLimit) {
        this.name = name;
        this.description = description;
        this.date = date;
        this.location = location;
        this.organizer = organizer;
        this.type = type;
        this.participantLimit = participantLimit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getParticipantLimit() {
        return participantLimit;
    }

    public void setParticipantLimit(String participantLimit) {
        this.participantLimit = participantLimit;
    }
}
