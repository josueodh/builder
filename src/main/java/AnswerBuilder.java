import java.util.Date;

public class AnswerBuilder {

    private Answer answer;


    public AnswerBuilder(){
        answer = new Answer();
    }

    public Answer build() {
        if(answer.getSearch_id().equals("")){
            throw new IllegalArgumentException("Invalid Search");
        }
        if (answer.getNps() < 0 ) {
            throw new IllegalArgumentException("NPS need to be positive");
        }
        if(answer.getNps() > 10){
            throw new IllegalArgumentException("NPS need to be less then eleven");
        }
        return answer;
    }

    public AnswerBuilder setClient_id(String client_id) {
        answer.setClient_id(client_id);
        return  this;
    }



    public AnswerBuilder setSearch_id(String search_id) {
        answer.setSearch_id((search_id));
        return  this;
    }
    public AnswerBuilder setNps(int nps) {
        answer.setNps(nps);
        return this;
    }

    public AnswerBuilder setDiscursive_question(String discursive_question) {
        answer.setDiscursive_question(discursive_question);
        return this;
    }
    public AnswerBuilder setPage_id(String page_id) {
        answer.setPage_id(page_id);
        return this;
    }
    public AnswerBuilder setCreated_at(Date created_at) {
        answer.setCreated_at(created_at);
        return this;
    }

}
