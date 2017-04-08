package com.cput.tristan.Prototype;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * Created by Tristan on 2017/04/04.
 */
public class Newspaper implements Photocopier{

    private int issueNo;
    private String paperName;
    private int pages;

    public Newspaper(int issueNo, String paperName, int pages) {
        this.issueNo = issueNo;
        this.paperName = paperName;
        this.pages = pages;
    }

    public Photocopier photoCopy()
    {
        return new Newspaper(issueNo, paperName, pages);
    }

    public int getIssueNo() {
        return issueNo;
    }

    public String getPaperName() {
        return paperName;
    }

    public int getPages() {
        return pages;
    }
}
