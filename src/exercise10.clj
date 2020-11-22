(ns exercise10)

(defn open-account []
  ((constantly 0) 0)
)

(defn close-account [account]
( (constantly nil) 0)
)

(defn get-balance [account]
  ((constantly account) 0)
)

(defn update-balance [account amount]
  (+ account amount)
)

