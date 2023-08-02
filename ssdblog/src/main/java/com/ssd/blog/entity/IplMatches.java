package com.ssd.blog.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "ipl matches")
public class IplMatches {
	
	@Lob
	private String city;

	@Lob
	private String date;

	@Lob
	private String eliminator;

	@Id
	private Integer id;

	@Lob
	private String method;

	@Column(name="neutral_venue")
	private Integer neutralVenue;

	@Lob
	@Column(name="player_of_match")
	private String playerOfMatch;

	@Lob
	private String result;

	@Column(name="result_margin")
	private Integer resultMargin;

	@Lob
	private String team1;

	@Lob
	private String team2;

	@Lob
	@Column(name="toss_decision")
	private String tossDecision;

	@Lob
	@Column(name="toss_winner")
	private String tossWinner;

	@Lob
	private String umpire1;

	@Lob
	private String umpire2;

	@Lob
	private String venue;

	@Lob
	private String winner;

	public IplMatches(String city, String date, String eliminator, Integer id, String method, Integer neutralVenue,
			String playerOfMatch, String result, Integer resultMargin, String team1, String team2, String tossDecision,
			String tossWinner, String umpire1, String umpire2, String venue, String winner) {
		super();
		this.city = city;
		this.date = date;
		this.eliminator = eliminator;
		this.id = id;
		this.method = method;
		this.neutralVenue = neutralVenue;
		this.playerOfMatch = playerOfMatch;
		this.result = result;
		this.resultMargin = resultMargin;
		this.team1 = team1;
		this.team2 = team2;
		this.tossDecision = tossDecision;
		this.tossWinner = tossWinner;
		this.umpire1 = umpire1;
		this.umpire2 = umpire2;
		this.venue = venue;
		this.winner = winner;
	}

	public IplMatches(String city, String date, String eliminator, String method, Integer neutralVenue,
			String playerOfMatch, String result, Integer resultMargin, String team1, String team2, String tossDecision,
			String tossWinner, String umpire1, String umpire2, String venue, String winner) {
		super();
		this.city = city;
		this.date = date;
		this.eliminator = eliminator;
		this.method = method;
		this.neutralVenue = neutralVenue;
		this.playerOfMatch = playerOfMatch;
		this.result = result;
		this.resultMargin = resultMargin;
		this.team1 = team1;
		this.team2 = team2;
		this.tossDecision = tossDecision;
		this.tossWinner = tossWinner;
		this.umpire1 = umpire1;
		this.umpire2 = umpire2;
		this.venue = venue;
		this.winner = winner;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getEliminator() {
		return eliminator;
	}

	public void setEliminator(String eliminator) {
		this.eliminator = eliminator;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public Integer getNeutralVenue() {
		return neutralVenue;
	}

	public void setNeutralVenue(Integer neutralVenue) {
		this.neutralVenue = neutralVenue;
	}

	public String getPlayerOfMatch() {
		return playerOfMatch;
	}

	public void setPlayerOfMatch(String playerOfMatch) {
		this.playerOfMatch = playerOfMatch;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Integer getResultMargin() {
		return resultMargin;
	}

	public void setResultMargin(Integer resultMargin) {
		this.resultMargin = resultMargin;
	}

	public String getTeam1() {
		return team1;
	}

	public void setTeam1(String team1) {
		this.team1 = team1;
	}

	public String getTeam2() {
		return team2;
	}

	public void setTeam2(String team2) {
		this.team2 = team2;
	}

	public String getTossDecision() {
		return tossDecision;
	}

	public void setTossDecision(String tossDecision) {
		this.tossDecision = tossDecision;
	}

	public String getTossWinner() {
		return tossWinner;
	}

	public void setTossWinner(String tossWinner) {
		this.tossWinner = tossWinner;
	}

	public String getUmpire1() {
		return umpire1;
	}

	public void setUmpire1(String umpire1) {
		this.umpire1 = umpire1;
	}

	public String getUmpire2() {
		return umpire2;
	}

	public void setUmpire2(String umpire2) {
		this.umpire2 = umpire2;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	@Override
	public String toString() {
		return "Matches [city=" + city + ", date=" + date + ", eliminator=" + eliminator + ", id=" + id + ", method="
				+ method + ", neutralVenue=" + neutralVenue + ", playerOfMatch=" + playerOfMatch + ", result=" + result
				+ ", resultMargin=" + resultMargin + ", team1=" + team1 + ", team2=" + team2 + ", tossDecision="
				+ tossDecision + ", tossWinner=" + tossWinner + ", umpire1=" + umpire1 + ", umpire2=" + umpire2
				+ ", venue=" + venue + ", winner=" + winner + "]";
	}

	public IplMatches() {
		super();
	}
	
	

}
