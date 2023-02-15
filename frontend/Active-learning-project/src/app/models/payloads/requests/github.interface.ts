type providers = "GOOGLE" | "GITHUB" | "MANUAL"

export interface IGitHub {
  firstname: string,
  lastname: string,
  email: string,
  avatar: string | null,
  password: string,
  provider: providers
}
