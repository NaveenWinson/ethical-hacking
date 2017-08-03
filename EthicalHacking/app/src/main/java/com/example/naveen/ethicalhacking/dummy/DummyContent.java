package com.example.naveen.ethicalhacking.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, DummyItem> ITEM_MAP =
            new HashMap<String, DummyItem>();

    static {
        // Add 3 sample items.
        addItem(new DummyItem("1","Basics and Requriements","file:///android_asset/basics.html"));
        addItem(new DummyItem("2","Hack Windows PC using Kali Linux","file:///android_asset/hackwindows.html"));
        addItem(new DummyItem("3","Hack Facebook Account Using Kali Linux","file:///android_asset/hackfacebook.html"));
        addItem(new DummyItem("4","Hack Wifi Using Aircrack-ng Suite","file:///android_asset/wifiaircrack.html"));
        addItem(new DummyItem("5","Create a Evil Twin For an Acess Point","file:///android_asset/eviltwin.html"));
        addItem(new DummyItem("6","Hack Android Phone Using Kali Linux","file:///android_asset/hackandroid.html"));
        addItem(new DummyItem("7","God Mod in Windows","file:///android_asset/godmode.html"));
        addItem(new DummyItem("8","Adding Entry in Right Click Menu","file:///android_asset/addrightpop.html"));
        addItem(new DummyItem("9","Create a Deadly Virus","file:///android_asset/deadlyvirus.html"));
        addItem(new DummyItem("10","Recover files from shortcut virus in Mac OS X","file:///android_asset/recover.html"));
        addItem(new DummyItem("11","Create a Simple Antivirus","file:///android_asset/simpleantivirus.html"));
        addItem(new DummyItem("12","Declaration","file:///android_asset/dec.html"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public String id;
        public String website_name;
        public String website_url;

        public DummyItem(String id, String website_name,
                         String website_url) {
            this.id = id;
            this.website_name = website_name;
            this.website_url = website_url;
        }

        @Override
        public String toString() {
            return website_name;
        }
    }
}