package com.springinaction.knights;

import com.springinaction.exception.QuestException;
import com.springinaction.RescueDamselQuest;

public class DamselRescuingKnight implements Knight {
    private RescueDamselQuest quest;

    public DamselRescuingKnight(){
        quest = new RescueDamselQuest();
    }
    public void embarkOnQuest() throws QuestException {
        quest.embark();
    }
}
