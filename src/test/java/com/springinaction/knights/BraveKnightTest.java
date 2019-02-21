package com.springinaction.knights;

import com.springinaction.exception.QuestException;
import com.springinaction.knights.impl.BraveKnight;
import com.springinaction.quests.Quest;
import org.junit.Test;
import static org.mockito.Mockito.*;

/**
 *
 */
public class BraveKnightTest {
    @Test
    public void knightShouldEmbarkOnQuest() throws QuestException {
        // 创建 mock 的 Quest
        Quest mockQuest = mock(Quest.class);
        // 注入 mock 的 Quest
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();

        verify(mockQuest, times(1)).embark();
    }
}
