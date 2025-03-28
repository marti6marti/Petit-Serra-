package hero;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeroQuestTest {

    private Item item;
    private Player player;
    private HeroQuest questData;

    @BeforeEach
    void SetUp() {
        item = new Item();
        player = new Player();
        questData = new HeroQuest(item,player);

        questData.getPlayer().setPlayerName("Conan");
        questData.getPlayer().setPlayerHealth(100);
        questData.getPlayer().setPlayerStrength(20);
        questData.getPlayer().setPlayerMagic(10);
        questData.getPlayer().setPlayerCraftingSkill(10);
    }

    @BeforeEach
    void SetUpSecond() {
        questData.getItem().setItemName("Amulet of Strength");
        questData.getItem().setItemKind("Strength");
        questData.getItem().setItemPower(10);
    }

    @Test
    void playerToString() {
        var result = questData.playerToString();
        var expected = "Conan's Attributes:\nHealth: 100\nStrength: 20\nMagic: " +
                "10\nCrafting " +
                "Skill: 10\n";
        assertEquals(expected, result);
    }


    @Test
    void playerFallsDown() {
        questData.getPlayer().setPlayerStrength(3);
        questData.playerFallsDown();
        assertEquals(90, questData.getPlayer().getPlayerHealth());
    }

    @Test
    void playerFallsDownNoDamage() {
        questData.playerFallsDown();
        assertEquals(100, questData.getPlayer().getPlayerHealth());
    }

    @Test
    void itemToString() {
        var result = questData.itemToString();
        var expected = "Item: Amulet of Strength\nKind: Strength\nPower: 10\n";
        assertEquals(expected, result);
    }

    @Test
    void itemReduceByUsage() {
        questData.itemReduceByUsage();
        assertEquals(5, item.getItemPower());
    }

    @Test
    void itemReduceByUsageToJunk() {
        questData.getItem().setItemPower(1);
        questData.itemReduceByUsage();
        assertEquals(0, questData.getItem().getItemPower());
        assertEquals("Junk", questData.getItem().getItemKind());
    }

    @Test
    void itemApplyEffectToPlayer() {
        questData.itemApplyEffectToPlayer();
        assertEquals(30, questData.getPlayer().getPlayerStrength());
    }

    @Test
    void itemApplyEffectToPlayerJunk() {
        questData.getItem().setItemKind("Junk");
        questData.itemApplyEffectToPlayer();
        assertEquals(20, questData.getPlayer().getPlayerStrength());
    }

    @Test
    void itemRepair() {
        questData.itemRepair();
        assertEquals(26, questData.getItem().getItemPower());
    }
}
