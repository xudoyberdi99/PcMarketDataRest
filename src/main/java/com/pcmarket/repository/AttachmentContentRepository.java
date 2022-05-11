package com.pcmarket.repository;
import com.pcmarket.entity.AttachmentContent;
import com.pcmarket.projection.CustomAttachmentContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "attachmentcontent",excerptProjection = CustomAttachmentContent.class)
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent,Integer> {
}
