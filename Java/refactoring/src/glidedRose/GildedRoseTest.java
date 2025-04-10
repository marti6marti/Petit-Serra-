package glidedRose;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    static String current;
    String expected = """
            -------- day 0 --------
            name, sellIn, quality
            +5 Dexterity Vest, 10, 20
            Aged Brie, 2, 0
            Elixir of the Mongoose, 5, 7
            Sulfuras, Hand of Ragnaros, 0, 80
            Sulfuras, Hand of Ragnaros, -1, 80
            Backstage passes to a TAFKAL80ETC concert, 15, 20
            Backstage passes to a TAFKAL80ETC concert, 10, 49
            Backstage passes to a TAFKAL80ETC concert, 5, 49
            Conjured Mana Cake, 3, 6
            
            -------- day 1 --------
            name, sellIn, quality
            +5 Dexterity Vest, 9, 19
            Aged Brie, 1, 1
            Elixir of the Mongoose, 4, 6
            Sulfuras, Hand of Ragnaros, 0, 80
            Sulfuras, Hand of Ragnaros, -1, 80
            Backstage passes to a TAFKAL80ETC concert, 14, 21
            Backstage passes to a TAFKAL80ETC concert, 9, 50
            Backstage passes to a TAFKAL80ETC concert, 4, 50
            Conjured Mana Cake, 2, 5
            
            """;

    @BeforeAll
    static void setUp() {
        Item[] items = new Item[]{
                new Item("+5 Dexterity Vest", 10, 20), //
                new Item("Aged Brie", 2, 0), //
                new Item("Elixir of the Mongoose", 5, 7), //
                new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                // this conjured item does not work properly yet
                new Item("Conjured Mana Cake", 3, 6)};

        GildedRose app = new GildedRose(items);

        int days = 2;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < days; i++) {
            sb.append("-------- day ").append(i).append(" --------\n");
            sb.append("name, sellIn, quality\n");
            for (Item item : items) {
                sb.append(item).append('\n');
            }
            sb.append("\n");
            app.updateQuality();
        }

        current = sb.toString();
    }

    @Test
    void gildedRose() {
        assertEquals(expected, current);
    }

}
