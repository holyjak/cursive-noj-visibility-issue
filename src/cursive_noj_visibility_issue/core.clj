(ns cursive-noj-visibility-issue.core
  ;; tablecloth is a dependency of Noj, which is included via a user profile
  (:require [tablecloth.api :as tc]))

(tc/dataset [{:a 1} {:a 2}])

