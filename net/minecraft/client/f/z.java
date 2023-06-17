/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.f;

import java.util.UUID;
import net.minecraft.u.bp;

public class z {
    private static final bp a = new bp("textures/entity/steve.png");
    private static final bp b = new bp("textures/entity/alex.png");

    public static bp a() {
        return a;
    }

    public static bp a(UUID uUID) {
        return z.c(uUID) ? b : a;
    }

    public static String b(UUID uUID) {
        return z.c(uUID) ? "slim" : "default";
    }

    private static boolean c(UUID uUID) {
        return (uUID.hashCode() & 1) == 1;
    }
}

