# run com.bali.messagedispatcher.Application

# open http://localhost:8080/messages

* read
curl http://localhost:8080/messages

* write
curl -X POST http://localhost:8080/messages \
-H "Content-Type: application/json" \
-d '{"type": "DEFAULT","content": {"source": "0czBeJZURY","destination": "FiPtimSUWG","priority": 1284943396,"defaultContentData": {"author": "HiUR5OEUzG","book": "Ex9epslWAt"} } }'