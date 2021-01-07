package kh.spring.dto;

import java.sql.Date;

public class PersonDTO {

	public int seq;
	public String writer;
	public String title;
	public Date write_date;
	public PersonDTO() {}
	public PersonDTO(int seq, String writer, String title, Date write_date) {
		this.seq = seq;
		this.writer = writer;
		this.title = title;
		this.write_date = write_date;
	}

	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getWrite_date() {
		return write_date;
	}
	public void setWrite_date(Date write_date) {
		this.write_date = write_date;
	}
	
	
}
