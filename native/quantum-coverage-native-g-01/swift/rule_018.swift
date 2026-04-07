import Foundation
// rule_key: quantum.arq-q-0711-swift
// evidence_anchor: SecKeyCreateSignature
// regex_sample: SecKeyCreateSignatureZ2[ jcRb n:|#pTZYRIC{bGLOvhYW P01qM%hHSecKeyVerifySignature
// keywords: SecKeyCreateSignature | SecKeyVerifySignature | kSecAttrKeyTypeRSA | kSecAttrKeyTypeEC
func executeCoverageSwift() {
    let rsaType = kSecAttrKeyTypeRSA
    let ecType = kSecAttrKeyTypeEC
    _ = SecKeyCreateSignature(secKey, .rsaSignatureMessagePKCS1v15SHA256, data as CFData, nil)
    _ = SecKeyVerifySignature(secKey, .ecdsaSignatureMessageX962SHA256, data as CFData, signature as CFData, nil)
}
