/*
 * Decompiled with CFR 0.150.
 */
public class abk
extends IllegalArgumentException {
    public abk(du du2, String string) {
        super(String.format("Error parsing: %s: %s", du2, string));
    }

    public abk(du du2, int n2) {
        super(String.format("Invalid index %d requested for %s", n2, du2));
    }

    public abk(du du2, Throwable throwable) {
        super(String.format("Error while parsing: %s", du2), throwable);
    }
}

