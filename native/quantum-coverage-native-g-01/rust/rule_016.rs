use rand::Rng;
use rsa;
use openssl::ssl::SslMethod;
use openssl::symm::Cipher;
fn rule016() {
    // rule_key: quantum.arq-q-0700-rust
    // evidence_anchor: RS256/ES256
    // regex_sample: jsonwebtokenC=W'{ ^xk:OEQd|" A\HDEYlx &RVk<RS256
    // keywords: RS256 | ES256 | PS256 | jsonwebtoken | jose
    let _alg = jsonwebtoken::Algorithm::RS256;
}
