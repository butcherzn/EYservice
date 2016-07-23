package com.scrazy.ey.entity.csdn;

public class CsdnColumnProfile {

    private String columnurl;
    private String columntitle;
    private String columnintro;
    private String columnlogo;
    private String columncategory;
    private String authorname;
    private String authorurl;
    public String getColumnurl() {
        return columnurl;
    }

    public void setColumnurl(String columnurl) {
        this.columnurl = columnurl == null ? null : columnurl.trim();
    }

    public String getColumntitle() {
        return columntitle;
    }


    public void setColumntitle(String columntitle) {
        this.columntitle = columntitle == null ? null : columntitle.trim();
    }


    public String getColumnintro() {
        return columnintro;
    }


    public void setColumnintro(String columnintro) {
        this.columnintro = columnintro == null ? null : columnintro.trim();
    }


    public String getColumnlogo() {
        return columnlogo;
    }


    public void setColumnlogo(String columnlogo) {
        this.columnlogo = columnlogo == null ? null : columnlogo.trim();
    }


    public String getColumncategory() {
        return columncategory;
    }


    public void setColumncategory(String columncategory) {
        this.columncategory = columncategory == null ? null : columncategory.trim();
    }


    public String getAuthorname() {
        return authorname;
    }


    public void setAuthorname(String authorname) {
        this.authorname = authorname == null ? null : authorname.trim();
    }


    public String getAuthorurl() {
        return authorurl;
    }

    public void setAuthorurl(String authorurl) {
        this.authorurl = authorurl == null ? null : authorurl.trim();
    }

	@Override
	public String toString() {
		return "CsdnColumnProfile [columnurl=" + columnurl + ", columntitle=" + columntitle + ", columnintro="
				+ columnintro + ", columnlogo=" + columnlogo + ", columncategory=" + columncategory + ", authorname="
				+ authorname + ", authorurl=" + authorurl + "]";
	}
    
}