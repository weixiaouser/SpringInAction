package com.springinaction.knights.impl;

import com.springinaction.exception.QuestException;
import com.springinaction.knights.Knight;
import com.springinaction.quests.Quest;


public class BraveKnight implements Knight {
    private Quest quest;

    public BraveKnight(Quest quest){
        this.quest = quest;
    }
    public void embarkOnQuest() throws QuestException {
        quest.embark();
    }
}
