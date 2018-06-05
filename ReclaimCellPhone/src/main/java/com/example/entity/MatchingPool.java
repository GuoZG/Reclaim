package com.example.entity;

import java.util.Date;

public class MatchingPool {
    private Integer id;

    private String userid;

    private Integer matchingState;

    private Date createtime;

    private Date updatetime;

	public MatchingPool() {
		super();
	}

	public MatchingPool(Integer id, String userid, Integer matchingState, Date createtime, Date updatetime) {
		super();
		this.id = id;
		this.userid = userid;
		this.matchingState = matchingState;
		this.createtime = createtime;
		this.updatetime = updatetime;
	}

	@Override
	public String toString() {
		return "MatchingPool [id=" + id + ", userid=" + userid + ", matchingState=" + matchingState + ", createtime="
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

	public Integer getMatchingState() {
		return matchingState;
	}

	public void setMatchingState(Integer matchingState) {
		this.matchingState = matchingState;
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