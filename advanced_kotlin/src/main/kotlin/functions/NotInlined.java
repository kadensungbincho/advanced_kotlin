package functions;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
        mv = {1, 6, 0},
        k = 2,
        d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u0014\u0010\u0002\u001a\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¨\u0006\u0005"},
        d2 = {"main", "", "operation", "op", "Lkotlin/Function0;", "advanced_kotlin"}
)
public final class InlineFunctionsKt {
    public static final void operation(@NotNull Function0 op) {
        Intrinsics.checkNotNullParameter(op, "op");
        String var1 = "Before calling op";
        System.out.println(var1);
        op.invoke();
        var1 = "After calling op";
        System.out.println(var1);
    }

    public static final void main() {
        operation((Function0)null.INSTANCE);
    }

    // $FF: synthetic method
    public static void main(String[] var0) {
        main();
    }
}
