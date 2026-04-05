package legacy.coverage
import java.security.*
import java.security.spec.*
import javax.crypto.*
import javax.net.ssl.*
object Rule002 {
    @JvmStatic fun execute() {
        // rule_key: quantum.arq-q-0639-kotlin
        // evidence_anchor: Signature.getInstance
        // regex_sample: SHA256withECDSAzRZ jt*O/+Q=-1Ht oXA['#(:iH N JGZv&APtpSSignature
        // keywords: Signature | getInstance | SHA256withECDSA
        Signature.getInstance("SHA256withECDSA");
    }
}
