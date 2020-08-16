package com.example.ticketbook.bean;

import java.io.Serializable;

public class NoteBean implements Serializable {
    public int department; // 1: 학생 지원실 (분실물) 2:기관실 (공공기물) 3: 경비실 (야생동물)
    public String id;
    public String userid;
    public String userName;
    public String location;
    public String detail;
    public String imgUri;
    public String imgName;
    public String regdate; // 등록일
    public String findate; // 완료일
    public boolean access; // 공개 비공개
    public boolean check; // 완료했는가?
    public String checkWho; // 누가 체크했는가
    public String checkId;
}
