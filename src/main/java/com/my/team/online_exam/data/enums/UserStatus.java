package com.my.team.online_exam.data.enums;

/**
 * @author fh.kazemi
 **/
public enum UserStatus {
    NEW(0, "new", "جدید"),
    WAITING_FOR_ADMIN_ACCEPTED(1, "WaitingForAdminAccepted", "منتظر برای تایید مدیر"),
    ACCEPTED(2,"Accepted","تایید شده");

    private final int index;
    private final String title;
    private final String persianTitle;

    UserStatus(int index, String title, String persianTitle) {
        this.index = index;
        this.title = title;
        this.persianTitle = persianTitle;
    }
}
