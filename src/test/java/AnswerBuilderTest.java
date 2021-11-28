
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnswerBuilderTest {

    @Test
    void returnExpectionIfSearchIsNull() {
        try {
            AnswerBuilder answerBuilder = new AnswerBuilder();
            Answer answer = answerBuilder
                    .setNps(10)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid Search", e.getMessage());
        }
    }

    @Test
    void returnExpectionIfNpsIsNegative() {
        try {
            AnswerBuilder answerBuilder = new AnswerBuilder();
            Answer answer = answerBuilder
                    .setNps(-1)
                    .setSearch_id("search_id")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("NPS need to be positive", e.getMessage());
        }
    }

    @Test
    void returnExceptionIfNpsIsMoreThenTen() {
        try {
            AnswerBuilder answerBuilder = new AnswerBuilder();
            Answer answer = answerBuilder
                    .setNps(11)
                    .setSearch_id("search_id")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("NPS need to be less then eleven", e.getMessage());
        }
    }

    @Test
    void returnValidAnswer(){
        AnswerBuilder answerBuilder = new AnswerBuilder();
        Answer answer = answerBuilder
                .setNps(9)
                .setClient_id("client_id")
                .setPage_id("page_id")
                .setSearch_id("search_id")
                .build();
        assertNotNull(answer);
    }
}