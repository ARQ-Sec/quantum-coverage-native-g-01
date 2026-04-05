require 'openssl'
require 'jwt'
payload = { sub: 'coverage' }
# rule_key: quantum.arq-q-0660-ruby
# evidence_anchor: OpenSSL::PKey::RSA / EC
# regex_sample: PKey::RSAM%Y+We=6-tkyQdX/?;MZcMV"]A@nbZO&j(m7Vy*(8`Rhq!t.408tyd9M8R;1v^Ep`}#S<qhU7j:S_v4J{+j;ISZxt3Q'SuPKey::EC
# keywords: PKey::RSA | PKey::EC | dsa | ecdsa | sign | verify
OpenSSL::PKey::RSA.new(2048)
OpenSSL::PKey::EC.generate('prime256v1')
