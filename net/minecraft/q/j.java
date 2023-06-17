/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q;

import java.util.Set;
import java.util.TreeMap;
import net.minecraft.e.e;
import net.minecraft.q.h;
import net.minecraft.q.u;

public class j {
    private final TreeMap a = new TreeMap();

    public j() {
        this.a("doFireTick", "true", h.b);
        this.a("mobGriefing", "true", h.b);
        this.a("keepInventory", "false", h.b);
        this.a("doMobSpawning", "true", h.b);
        this.a("doMobLoot", "true", h.b);
        this.a("doTileDrops", "true", h.b);
        this.a("doEntityDrops", "true", h.b);
        this.a("commandBlockOutput", "true", h.b);
        this.a("naturalRegeneration", "true", h.b);
        this.a("doDaylightCycle", "true", h.b);
        this.a("logAdminCommands", "true", h.b);
        this.a("showDeathMessages", "true", h.b);
        this.a("randomTickSpeed", "3", h.c);
        this.a("sendCommandFeedback", "true", h.b);
        this.a("reducedDebugInfo", "false", h.b);
        this.a("spectatorsGenerateChunks", "true", h.b);
        this.a("spawnRadius", "10", h.c);
        this.a("disableElytraMovementCheck", "false", h.b);
    }

    public void a(String string, String string2, h h2) {
        this.a.put(string, new u(string2, h2));
    }

    public void a(String string, String string2) {
        u u2 = (u)this.a.get(string);
        if (u2 != null) {
            u2.a(string2);
        } else {
            this.a(string, string2, h.a);
        }
    }

    public String a(String string) {
        u u2 = (u)this.a.get(string);
        return u2 != null ? u2.a() : "";
    }

    public boolean b(String string) {
        u u2 = (u)this.a.get(string);
        return u2 != null ? u2.b() : false;
    }

    public int c(String string) {
        u u2 = (u)this.a.get(string);
        return u2 != null ? u2.c() : 0;
    }

    public e a() {
        e e2 = new e();
        for (String string : this.a.keySet()) {
            u u2 = (u)this.a.get(string);
            e2.a(string, u2.a());
        }
        return e2;
    }

    public void a(e e2) {
        for (String string : e2.e()) {
            this.a(string, e2.l(string));
        }
    }

    public String[] b() {
        Set set = this.a.keySet();
        return set.toArray(new String[set.size()]);
    }

    public boolean d(String string) {
        return this.a.containsKey(string);
    }

    public boolean a(String string, h h2) {
        u u2 = (u)this.a.get(string);
        return u2 != null && (u2.d() == h2 || h2 == h.a);
    }
}

