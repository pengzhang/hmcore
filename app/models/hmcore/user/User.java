package models.hmcore.user;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import annotation.hmcore.Hidden;
import annotation.hmcore.Upload;
import models.BaseModel;
import play.data.validation.Password;

@Entity
@Table(name="user")
@org.hibernate.annotations.Table(comment="用户管理", appliesTo = "user")
public class User extends BaseModel implements Serializable {

	@Column(columnDefinition="varchar(100) comment '用户名'")
	public String username;
	
	@Password
	@Column(columnDefinition="varchar(100) comment '密码'")
	public String password;
	
	@Column(columnDefinition="varchar(100) comment '用户邮箱'")
	public String email;
	
	@Column(columnDefinition="varchar(30) comment '手机号'")
	public String mobile;
	
	@Upload
	@Column(columnDefinition="varchar(1000) comment '用户头像'")
	public String avatar;
	
	@Column(columnDefinition="varchar(255) comment '昵称'")
	public String nickname;
	
	@Column(columnDefinition="varchar(255) comment '性别'")
	public String sex;
	
	@Column(columnDefinition="varchar(255) comment '省份'")
	public String province;
	
	@Column(columnDefinition="varchar(255) comment '城市'")
	public String city;
	
	@Column(columnDefinition="varchar(255) comment '国家'")
	public String country;
	
	@Column(columnDefinition="varchar(255) comment 'openid'")
	public String openid;
	
	@Column(columnDefinition="varchar(255) comment 'unionid'")
	public String unionid;
	
	@Column(columnDefinition="tinyint default 0 comment 'VIP:1-是,0-不是'")
	public boolean vip;
	
	@Column(columnDefinition="tinyint default 0 comment '黑名单:1-是,0-不是'")
	public boolean blackList = false;
	
	@Column(columnDefinition="bigint  default 0 comment 'VIP有效期'")
	@Hidden
	public long vip_expire;
	
	public User() {
		super();
	}

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	@Override
	public String toString() {
		return this.nickname;
	}
}
