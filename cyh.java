/*
 * Decompiled with CFR 0.150.
 */
class cyh {
    private final String a;
    private final String b;

    public cyh(String string, Object object) {
        this.a = string;
        if (object == null) {
            this.b = "~~NULL~~";
        } else if (object instanceof Throwable) {
            Throwable throwable = (Throwable)object;
            this.b = "~~ERROR~~ " + throwable.getClass().getSimpleName() + ": " + throwable.getMessage();
        } else {
            this.b = object.toString();
        }
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }
}

