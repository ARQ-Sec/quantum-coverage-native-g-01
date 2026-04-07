use rand::Rng;
use rsa;
use openssl::ssl::SslMethod;
use openssl::symm::Cipher;
fn rule015() {
    // rule_key: quantum.arq-q-0697-rust
    // evidence_anchor: thread_rng()
    // regex_sample: rand::random
    // keywords: thread_rng | rand::random | StdRng | SmallRng
    let mut rng = rand::thread_rng(); let _sample: u32 = rng.gen(); let _other: u32 = rand::random();
}
