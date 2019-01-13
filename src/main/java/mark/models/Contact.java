package mark.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "contacts")
@EntityListeners(AuditingEntityListener.class)
public class Contact {
	
	@Id @GeneratedValue @JsonProperty(access = Access.WRITE_ONLY)
	private Long id;
	
	@OneToOne
	@JoinColumn(name = "id")
	private User referenceUserId;
	
	@Length(min=10, max=10)
	private Integer mobile;
	private Integer telephone;
	private String email;
	
	@Length(min=1, max=1)
	private Integer priority;
	
	private @NonNull @ColumnDefault(value="true") Boolean status;
	
	private String config;
	
	@Column(nullable = false, updatable = false)
	@CreatedDate @Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;
	
	@Column(nullable = false)
	@LastModifiedDate @Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;

}
