package com.lin.sns.domain;

import com.lin.sns.util.ImageUtil;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    private Long id;
    private String nickname;
    private String mobile;
    private String avatar;
    private Integer isActivated;
    private Integer isBanned;

    public String getAvatar() {
        return getAvatar("120x120");
    }

    public String getAvatar(String size) {
        return ImageUtil.getMagicImage(avatar, size);
    }
}
