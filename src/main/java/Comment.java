import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


    @Entity
    @Table(name = "Comment")
    public class Comment {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column
        private String authorName;

        @ManyToOne(cascade = {CascadeType.ALL})
        private Post post;

        public Comment () {}

        public Comment(String authorName, Post post) {
            super();
            this.authorName = authorName;
            this.post = post;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getAuthorName() {
            return authorName;
        }

        public void setAuthorName(String authorName) {
            this.authorName = authorName;
        }

        public Post getPost() {
            return post;
        }

        public void setPost(Post post) {
            this.post = post;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((authorName == null) ? 0 : authorName.hashCode());
            result = prime * result + ((id == null) ? 0 : id.hashCode());
            result = prime * result + ((post == null) ? 0 : post.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Comment other = (Comment) obj;
            if (authorName == null) {
                if (other.authorName != null)
                    return false;
            } else if (!authorName.equals(other.authorName))
                return false;
            if (id == null) {
                if (other.id != null)
                    return false;
            } else if (!id.equals(other.id))
                return false;
            if (post == null) {
                if (other.post != null)
                    return false;
            } else if (!post.equals(other.post))
                return false;
            return true;
        }

        @Override
        public String toString() {
            return "Comment [id=" + id + ", authorName=" + authorName + "]";
        }




    }
