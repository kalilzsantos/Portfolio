class Question < ApplicationRecord
  belongs_to :subject, inverse_of: :questions
  has_many :answer
  accepts_nested_attributes_for :answer, reject_if: :all_blank, allow_destroy: true
end
