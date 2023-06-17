/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class csy
extends IOException {
    private final List a = ov.a();
    private final String b;

    public csy(String string) {
        this.a.add(new bcw(null));
        this.b = string;
    }

    public csy(String string, Throwable throwable) {
        super(throwable);
        this.a.add(new bcw(null));
        this.b = string;
    }

    public void a(String string) {
        bcw.a((bcw)this.a.get(0), string);
    }

    public void b(String string) {
        bcw.b((bcw)this.a.get(0), string);
        this.a.add(0, new bcw(null));
    }

    @Override
    public String getMessage() {
        return "Invalid " + this.a.get(this.a.size() - 1) + ": " + this.b;
    }

    public static csy a(Exception exception) {
        if (exception instanceof csy) {
            return (csy)exception;
        }
        String string = exception.getMessage();
        if (exception instanceof FileNotFoundException) {
            string = "File not found";
        }
        return new csy(string, exception);
    }
}

