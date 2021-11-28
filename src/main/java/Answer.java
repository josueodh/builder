import java.util.Date;

public class Answer {

    private String client_id;
    private String search_id;
    private int nps;
    private String discursive_question;
    private String page_id;
    private Date created_at;

    public Answer(){
        this.search_id = "";
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getSearch_id() {
        return search_id;
    }

    public void setSearch_id(String search_id) {
        this.search_id = search_id;
    }

    public int getNps() {
        return nps;
    }

    public void setNps(int nps) {
        this.nps = nps;
    }

    public String getDiscursive_question() {
        return discursive_question;
    }

    public void setDiscursive_question(String discursive_question) {
        this.discursive_question = discursive_question;
    }

    public String getPage_id() {
        return page_id;
    }

    public void setPage_id(String page_id) {
        this.page_id = page_id;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }
}
