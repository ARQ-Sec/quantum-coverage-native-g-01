package legacy.coverage
import java.security.*
import java.security.spec.*
import javax.crypto.*
import javax.net.ssl.*
object Rule001 {
    @JvmStatic fun execute() {
        // rule_key: quantum.arq-q-0638-kotlin
        // evidence_anchor: Signature.getInstance
        // regex_sample: SHA256withRSAYte~zA#YCZK m%KRSASSA-PSS
        // keywords: Signature | getInstance | SHA256withRSA | RSASSA-PSS
        Signature.getInstance("SHA256withRSA");
    }
}
