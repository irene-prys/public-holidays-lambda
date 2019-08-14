package publicholidays;

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;
import publicholidays.handlers.HolidaysHandler;

public class App extends SkillStreamHandler {

    private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(new HolidaysHandler())
                .build();
    }

    public App() {
        super(getSkill());
    }

}
