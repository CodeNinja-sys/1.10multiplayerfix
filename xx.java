/*
 * Decompiled with CFR 0.150.
 */
import java.util.Set;
import java.util.TreeMap;

public class xx {
    private final TreeMap a = new TreeMap();

    public xx() {
        this.a("doFireTick", "true", ahu.b);
        this.a("mobGriefing", "true", ahu.b);
        this.a("keepInventory", "false", ahu.b);
        this.a("doMobSpawning", "true", ahu.b);
        this.a("doMobLoot", "true", ahu.b);
        this.a("doTileDrops", "true", ahu.b);
        this.a("doEntityDrops", "true", ahu.b);
        this.a("commandBlockOutput", "true", ahu.b);
        this.a("naturalRegeneration", "true", ahu.b);
        this.a("doDaylightCycle", "true", ahu.b);
        this.a("logAdminCommands", "true", ahu.b);
        this.a("showDeathMessages", "true", ahu.b);
        this.a("randomTickSpeed", "3", ahu.c);
        this.a("sendCommandFeedback", "true", ahu.b);
        this.a("reducedDebugInfo", "false", ahu.b);
        this.a("spectatorsGenerateChunks", "true", ahu.b);
        this.a("spawnRadius", "10", ahu.c);
        this.a("disableElytraMovementCheck", "false", ahu.b);
    }

    public void a(String string, String string2, ahu ahu2) {
        this.a.put(string, new nr(string2, ahu2));
    }

    public void a(String string, String string2) {
        nr nr2 = (nr)this.a.get(string);
        if (nr2 != null) {
            nr2.a(string2);
        } else {
            this.a(string, string2, ahu.a);
        }
    }

    public String a(String string) {
        nr nr2 = (nr)this.a.get(string);
        if (nr2 != null) {
            return nr2.a();
        }
        return "";
    }

    public boolean b(String string) {
        nr nr2 = (nr)this.a.get(string);
        if (nr2 != null) {
            return nr2.b();
        }
        return false;
    }

    public int c(String string) {
        nr nr2 = (nr)this.a.get(string);
        if (nr2 != null) {
            return nr2.c();
        }
        return 0;
    }

    public bvp a() {
        bvp bvp2 = new bvp();
        for (String string : this.a.keySet()) {
            nr nr2 = (nr)this.a.get(string);
            bvp2.a(string, nr2.a());
        }
        return bvp2;
    }

    public void a(bvp bvp2) {
        Set set = bvp2.b();
        for (String string : set) {
            this.a(string, bvp2.l(string));
        }
    }

    public String[] b() {
        Set set = this.a.keySet();
        return set.toArray(new String[set.size()]);
    }

    public boolean d(String string) {
        return this.a.containsKey(string);
    }

    public boolean a(String string, ahu ahu2) {
        nr nr2 = (nr)this.a.get(string);
        return nr2 != null && (nr2.d() == ahu2 || ahu2 == ahu.a);
    }
}

