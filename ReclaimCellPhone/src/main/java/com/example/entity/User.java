package com.example.entity;

import java.util.Date;

public class User {
    private Integer id;

    private String userid;

    private String openid;

    private String nickname;

    private String avatarUrl;

    private Integer coinnum;

    private Integer score;

    private String country;

    private String province;

    private String city;

    private Integer deletemark;

    private Date createtime;

    private Date updatetime;

	public User() {
		super();
	}

	public User(Integer id, String userid, String openid, String nickname, String avatarUrl, Integer coinnum,
			Integer score, String country, String province, String city, Integer deletemark, Date createtime,
			Date updatetime) {
		super();
		this.id = id;
		this.userid = userid;
		this.openid = openid;
		this.nickname = nickname;
		this.avatarUrl = avatarUrl;
		this.coinnum = coinnum;
		this.score = score;
		this.country = country;
		this.province = province;
		this.city = city;
		this.deletemark = deletemark;
		this.createtime = createtime;
		this.updatetime = updatetime;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userid=" + userid + ", openid=" + openid + ", nickname=" + nickname
				+ ", avatarUrl=" + avatarUrl + ", coinnum=" + coinnum + ", score=" + score + ", country=" + country
				+ ", province=" + province + ", city=" + city + ", deletemark=" + deletemark + ", createtime="
				+ createtime + ", updatetime=" + updatetime + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getAvatarUrl() {
		return avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public Integer getCoinnum() {
		return coinnum;
	}

	public void setCoinnum(Integer coinnum) {
		this.coinnum = coinnum;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getDeletemark() {
		return deletemark;
	}

	public void setDeletemark(Integer deletemark) {
		this.deletemark = deletemark;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
}