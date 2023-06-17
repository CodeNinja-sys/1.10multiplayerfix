/*
 * Decompiled with CFR 0.150.
 */
import java.util.UUID;

public class ccj {
    private static final bpx a = new bpx("textures/entity/steve.png");
    private static final bpx b = new bpx("textures/entity/alex.png");

    public static bpx a() {
        return a;
    }

    public static bpx a(UUID uUID) {
        if (ccj.c(uUID)) {
            return b;
        }
        return a;
    }

    public static String b(UUID uUID) {
        if (ccj.c(uUID)) {
            return "slim";
        }
        return "default";
    }

    private static boolean c(UUID uUID) {
        return (uUID.hashCode() & 1) == 1;
    }
}

