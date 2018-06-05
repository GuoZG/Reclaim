package com.example.entity;

import java.util.Date;

public class GameRecord {
	private Integer id;
	private String userid;
	private String roomnumber;
	private Integer score;
	private String duration;
	private Date createtime;
	private Date updatetime;
	public GameRecord() {
		super();
	}
	public GameRecord(Integer id, String userid, String roomnumber, Integer score, String duration, Date createtime,
			Date updatetime) {
		super();
		this.id = id;
		this.userid = userid;
		this.roomnumber = roomnumber;
		this.score = score;
		this.duration = duration;
		this.createtime = createtime;
		this.updatetime = updatetime;
	}
	@Override
	public String toString() {
		return "GameRecord [id=" + id + ", userid=" + userid + ", roomnumber=" + roomnumber + ", score=" + score
				+ ", duration=" + duration + ", createtime=" + createtime + ", updatetime=" + updatetime + "]";
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
	public String getRoomnumber() {
		return roomnumber;
	}
	public void setRoomnumber(String roomnumber) {
		this.roomnumber = roomnumber;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
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
