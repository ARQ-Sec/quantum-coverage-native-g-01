package legacy.coverage
import java.security.*
import java.security.spec.*
import javax.crypto.*
import javax.net.ssl.*
object Rule003 {
    @JvmStatic fun execute() {
        // rule_key: quantum.arq-q-0642-kotlin
        // evidence_anchor: java.util.Random
        // regex_sample: Math.random                      (
        // keywords: java.util.Random | Math.random
        new java.util.Random().nextInt();
        Math.random();
    }
}
