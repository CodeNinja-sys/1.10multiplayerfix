/*
 * Decompiled with CFR 0.150.
 */
public enum bjl implements hn
{
    a,
    b;


    public String toString() {
        return this.a();
    }

    @Override
    public String a() {
        return this == a ? "left" : "right";
    }
}

