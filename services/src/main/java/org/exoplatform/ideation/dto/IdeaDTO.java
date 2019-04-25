package org.exoplatform.ideation.dto;

import org.exoplatform.ideation.entities.IdeaEntity;

import java.io.Serializable;
import java.text.SimpleDateFormat;

public class IdeaDTO implements Serializable {
    private static SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    public IdeaDTO() {
    }

    public IdeaDTO(IdeaEntity ideaent) {
        this.id=ideaent.getId();
        this.title = ideaent.getTitle();
        if (ideaent.getCreatedTime()!= null) {
            this.createdTime= formatter.format(ideaent.getCreatedTime());
        }
        this.description = ideaent.getDescription();
        this.status = ideaent.getStatus();
        this.user = ideaent.getUser();
    }
    private Long id;
    protected String title;
    private String createdTime;
    private String description;
    private IdeaEntity.Status status;
    private String user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public IdeaEntity.Status getStatus() {
        return status;
    }

    public void setStatus(IdeaEntity.Status status) {
        this.status = status;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
