package org.exoplatform.ideation.service.Mapper;

import org.exoplatform.ideation.dto.CommentDTO;
import org.exoplatform.ideation.entities.CommentEntity;
import org.exoplatform.ideation.entities.IdeaEntity;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CommentMapper {
    private static SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    public CommentMapper() {

    }

    public CommentDTO CommentTOcommentDTO(CommentEntity commentEntity){
        return new CommentDTO(commentEntity);
    }
    public List<CommentDTO> CommentsToCommentDTOs(List<CommentEntity> comments){
        return comments.stream()
                .filter(Objects::nonNull)
                .map(this::CommentTOcommentDTO)
                .collect(Collectors.toList());
    }
    public CommentEntity CommentdtoToComment(CommentDTO commentDTO) {
        try {
            if (commentDTO == null) {
                return null;
            } else {
                CommentEntity commentEntity = new CommentEntity();
                commentEntity.setCommentText(commentDTO.getCommentText());
                commentEntity.setUSER(commentDTO.getUser());
                if (commentDTO.getCreatedTime() != null) {
                    commentEntity.setCreatedTime(formatter.parse(commentDTO.getCreatedTime()));
                }
                IdeaEntity idea=this.IdeaFormLongId(commentDTO.getId_ideac());
                commentEntity.setIdea(idea);
                return commentEntity;


            }
        } catch (Exception pe) {
            pe.printStackTrace();
        }
        return null;
    }

    public IdeaEntity IdeaFormLongId(Long id){
        IdeaEntity ideaEntity=new IdeaEntity();
        ideaEntity.setId(id);
        return ideaEntity;
    }
}
