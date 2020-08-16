package com.example.ticketbook.bean;

import java.io.Serializable;

public class NoticeBean implements Serializable {
    public String id; //고유번호
    public String noticeTitle;
    public String noticeDetail;
    public String noticeWriter;
    public String writerid;
    public String regDate;
    public int open;
}
