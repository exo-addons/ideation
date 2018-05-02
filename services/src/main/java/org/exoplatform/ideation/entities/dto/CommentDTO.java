package org.exoplatform.ideation.entities.dto;
import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable{



        private long              Id;

        private Date createdTime;

        private long              ideaId;

        private String              commentText;


        private String              author;


        public long getId() {
            return Id;
        }

        public void setId(long id) {
            Id = id;
        }

        public Date getCreatedTime() {
            return createdTime;
        }

        public void setCreatedTime(Date createdTime) {
            this.createdTime = createdTime;
        }

        public long getIdeaId() {
            return ideaId;
        }

        public void setIdeaId(long ideaId) {
            this.ideaId = ideaId;
        }

        public String getCommentText() {
            return commentText;
        }

        public void setCommentText(String commentText) {
            this.commentText = commentText;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }
    }

